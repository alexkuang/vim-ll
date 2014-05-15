// Let's say you're trying to change "lazy dog" to "lazy stupid dog."  There are a few approaches to get your cursor
// between the two words, starting from the beginning of the line.
//   - `hjkl`, tantamount to using the arrow keys.  You would have to do something like 40-41 presses of l--Or hold down the
//     key.
//   - `w`, wordwise movement, would get you there in ~9 keystrokes
//   - `W`, WORDwise, in 8
//   - `fd`, in 2.  :)
"The quick brown fox jumps over the lazy dog."

// Some quick visual mode selections for demonstration:
//  - `vi"`
//  - `vi(`
//  - `vi`
//  - `vt,`
println("The quick, brown fox jumps over the lazy dog")
