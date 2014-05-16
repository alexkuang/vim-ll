# Filters and the expression register are two really cool ways of calling arbitrary code from vim.

# Filters are just anything that takes your text via stdin and gives you something via stdout
# Filters can be invoked via `!{motion}` or `!` while selecting, and can call arbitrary scripts
# Examples with either `!}` or `v}!`:
#   - !grep cat
#   - !sed s/dog/cat/
#   - !sed s/cat/dog/
#   - !echo foo
# 
# This works with arbitrary scripts (do_stuff_to_my_code.sh, print_funny_comment.sh, etc) as well!

"The quick brown fox jumps over the lazy dog"
"The quick brown fox jumps over the lazy dog"
"The quick brown fox jumps over the lazy cat"
"The quick brown fox jumps over the lazy dog"


# Expression registers are similar but not quite--They are for evaluating arbitrary vimscript expressions.  This MAY
# include a system() that shells out to something external, but probably not the greatest idea.  Like other registers,
# you can access the expression register via <CTRL-r>--In this case, `<CTRL-r>=`.

# Ex: `<CTRL-r>=1+1<CR>` from insert mode will print '2'
