### Go implementation

This Go target cannot be used with ANTLR 4.13.2 at this time (Sept. 2024). 
The necessary Go [runtime modification](https://github.com/antlr/antlr4/pull/4626) is awaiting for a review.
It will probably be merged in the next ANTLR4 version.
In the meantime, anyone who needs it can modify their local runtime based on [this](https://github.com/antlr/antlr4/pull/4626/commits/735cfcb21a25b7eacd0b06cd3307f4281c76edf3) and [this](https://github.com/antlr/antlr4/pull/4626/commits/5b9c537649f80d149d3613fb29eb69f3923fd64f).

#### Related links:
 - [Go target](https://github.com/antlr/antlr4/blob/dev/doc/go-target.md)
 - [ANTLR4 parser for Python 3.8.20 with Go target](https://github.com/RobEin/ANTLR4-parser-for-Python-3.8/tree/main/port_Go)
 - [ANTLR4 parser for Python 2.7.18 with Go target](https://github.com/RobEin/ANTLR4-parser-for-Python-2.7.18/tree/main/port_Go)
 - [Tiny Python with Go target](https://github.com/RobEin/tiny-python/tree/master/port_Go)
 