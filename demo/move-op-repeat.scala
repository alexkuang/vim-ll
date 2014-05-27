// Vim has many normal mode keys to easte the pains of repetition, but `.` is
// the one that is (probably) used most often.  `.` will repeat the last
// "action" taken. Some quick examples of what counts as "one action":
//  - dropping into insert mode to insert text
//  - `dd`, deleting a line
//  - `di"`, deleting inner quotes
//  - `cit`, changing inner tags
//  - `O`, insert one empty line above current one



// Suppose you have a series of function calls, all of which took one parameter
// which is a string.  You are refactoring the code, and decided that you can
// decide the string based on some other data source, and no longer need it as a
// parameter.

// One very quick way to do it would be:
// `f(di(j.j.j.`
//  - `f(` => forward to next occurrence of (
//  - `di(` => delete inner (
//  - `j.` => move down, repeat last action
val v1 = foo("bar 1")
val v2 = foo("bar 2")
val v2 = foo("bar 3")
val v2 = foo("foo 4")



// A new technical manager really loves hungarian notation, so you must refactor
// the following variables and append 'Int' to all of them.
// `flaInt<Esc>W.W.W.W.`
//  - `fl` => forward to next occurrence of l
//  - `aInt<Esc> => append 'Int' at the cursor, drop back to Normal mode
//  - `W.` => move to next WORD (WORD is delimited only by space, word can be
//  delimited by punctuation as well), repeat last action
foo(l, m, n, o, p)



// You are converting the following snippet from Scala to Java (WHY????).  The
// first step is to insert semi-colons at the ends of lines.
// `A;<Esc>j.j.`
//  - `A;<Esc>` => Append colon at the end of line, drop back to Normal mode
//  - `j.` => move down, repeat last action
val v1 = foo("bar 1")
val v2 = foo("bar 2")
val v3 = v1 + v2
