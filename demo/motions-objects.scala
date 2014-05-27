// Motions and text objects are very powerful ways to navigate + describe your text.



// Let's say you're trying to put your cursor onto the 'd' in dog.  There are
// a few approaches to get your cursor there, starting from the
// beginning of the line.
//   - `hjkl`, tantamount to using the arrow keys.  You would have to do
//     something like 40-41 presses of l--Or hold down the key.
//   - `w`, wordwise movement, would get you there in ~9 keystrokes
//   - `$bb`, end of line -> back 2 words, would get there in 3 (or 4, counting
//     the shift)
//   - `fd`, in 2.  :)
//   - `tdl`, if you're feeling quirky...
"The quick brown fox jumps over the lazy dog."



// Suppose you have some span element in html, and you wish to change the inner
// content to "bar button" instead of "foo span".  Instead of finicky
// highlighting with the mouse, you can use `citbar button`:
//  - `cit` => 'change inner tag'
<span class="foo">foo span</span>



// Suppose you want to change the class now, as well.  Simply `f"ci"bar`:
//  - `f"` => forward to next occurrence of "
//  - `ci"` => change innner "
<span class="foo">bar</span>



// Modifiers also work across lines!  While inside the method body, `di{` will
// empty out the entire method body.
def foo(): Int {
  val i = func1()
  val j = func2()
}



// Or to turn foo() into an abstract method, simply `da{` which will include the
// { as well.
def foo(): Int {
  val i = func1()
  val j = func2()
}



// Finally, motions can be used as well to delete from the cursor's current
// position to the motion's target.  In the below method call, if we are looking
// to eliminate arg2 and arg3 from the call, we can use `f,df3`:
//  - `f,` => forward to next occurrence of ,
//  - `df3` => delete forward to next occurrence of 3
// 
// Alternately, `f,dt)` would also work!  "delete till next occurrence of )"
foo(arg1, arg2, arg3)
