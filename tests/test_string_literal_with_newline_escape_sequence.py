# REQUIREMENTS:
#   - removed \<newline> escape sequence from the STRING token
#   - hidden token (channel=1) with the original the string literal
#   - no error message

s = 'This string will not include \
backslashes or newline characters.'
