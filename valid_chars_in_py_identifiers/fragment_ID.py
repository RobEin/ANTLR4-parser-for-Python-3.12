# related link:  https://github.com/asmeurer/python-unicode-variable-names

import sys

def main():
    start_codes = []
    continue_codes = []

    for i in range(sys.maxunicode):
        c = chr(i)
        if c.isidentifier():
            start_codes.append(i)
        else:
            id = 'a' + c
            if id.isidentifier():
                continue_codes.append(i)

    continue_list = \
        "fragment ID_CONTINUE:\n" \
        "    ID_START\n" \
        "    | " + get_ranged_list(continue_codes) + "\n" \
        ";"    

    start_list = \
        "fragment ID_START:\n" \
        "    " + get_ranged_list(start_codes) + "\n" \
        ";"

    fragment_ID = continue_list + "\n\n" + start_list
    print(fragment_ID)
    save(fragment_ID, "fragment_ID.txt")

def get_ranged_list(codes):
    ranged_array = []
    
    unicode_from = sys.maxunicode
    unicode_to = -2
    for i in codes:
        if i - unicode_to == 1:
            unicode_to = i
        else:
            if unicode_from < unicode_to:
                ranged_array[-1] += " .. " + get_antlr4_hex(unicode_to)
            unicode_from = i
            unicode_to = i
            ranged_array.append(get_antlr4_hex(unicode_from))
    else:
        if unicode_from < unicode_to:
            ranged_array[-1] += " .. " + get_antlr4_hex(unicode_to)

    return "\n    | ".join(ranged_array)

def get_antlr4_hex(i):
    return "'\\u{" + f"{i:04X}" + "}'"

def save(text, file_name):
    f = open(file_name, "w")
    f.write(text)
    f.close()

if __name__ == "__main__":
    main()
