#!/usr/bin/env python

# Normal mode is where you spend the majority of your time (hence the name).  You can do things like `dd` to delete a
# line, or `yyp` to copy + paste, etc:
print "The quick brown fox jumps over the lazy dog"



# From normal mode, drop into insert with the I key.  Pretty self-explanatory.



# Visual mode is a bit more interesting.  There are a few varieties of visual mode that can be pretty interesting:
#   - v is "plain" visual mode, char-wise selection
#   - V is visual line
#   - <CTRL-v> is block visual

# block-wise is especially interesting, for uses like commenting in python.  For example, in the below block:
# `<CTRL-v>` and select the first column, then `I` to insert before, `# ` for commenting, and <ESC> to complete.
print "this is a debug message"
print "this is another debug message"
print "this is a third debug message"



# Ex mode is like the command-line, and gets its name from another Bill Joy editor, ex.  There are the vanilla things
# like :w for write or :q for quit, but also some pretty cool things, for example:

# `:s/fox/monkey` on the below line
print "The quick brown fox jumps over the lazy dog"

# Or - `:g/print/p`, and `:g/debug/d`
