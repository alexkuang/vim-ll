// Let's say you're trying to change "lazy dog" to "lazy stupid dog."  There are a few approaches to get your cursor
// between the two words, starting from the beginning of the line.
//   - `hjkl`, tantamount to using the arrow keys.  You would have to do something like 40-41 presses of l--Or hold down the
//     key.
//   - `w`, wordwise movement, would get you there in ~9 keystrokes
//   - `$bb`, end of line -> back 2 words, would get there in 3 (or 4, counting the shift)
//   - `fd`, in 2.  :)
//   - `tdl`, if you're feeling quirky...
"The quick brown fox jumps over the lazy dog."

// Some quick visual mode selections for demonstration:
//  - `viw`
//  - `vi"`
//  - `va"`
//  - `vt,`
println("The quick, brown fox jumps over the lazy dog")
