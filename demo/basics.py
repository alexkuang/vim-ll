# The first thing a new vim user probably wants to know is how to exit the
# application.  This is easiest with the keys: `:q!<Enter>` in Normal mode.
# Much like in any application, you can pretty safely "escape" back to Normal
# mode by hammering <Esc> and <Ctrl-C> a couple dozen times.

# Normal mode is where you spend the majority of your time (hence the name).
# You can use keys like `dd` to delete a line, or `yyp` to copy + paste, etc:
print "The quick brown fox jumps over the lazy dog"

# Insert mode is another common mode; keys in this mode will insert new text.
# Insert mode can be reached by hitting `i` in Normal mode.

# Certain commands will also drop into Insert, like `cc` which behaves like `dd`
# but drops into Insert mode, making it easier to replace the line's text with
# something else.  `c` (for 'c'hange) is a very useful letter to know in
# general, as coders do a lot of 'delete this thing and change to that'.
print "The quick brown fox jumps over the lazy dog"



# There are other modes as well, but they can be explained later
