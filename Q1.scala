object Q1 {
  def encrypt(text: String, shift: Int): String = {
    text.map { char =>
      if (char.isLetter) {
        val base = if (char.isUpper) 'A' else 'a'
        ((char - base + shift) % 26 + base).toChar
      } else {
        char
      }
    }
  }

  def decrypt(text: String, shift: Int): String = {
    encrypt(text, 26 - shift)
  }

  def cipher(text: String, shift: Int, mode: (String, Int) => String): String = {
    mode(text, shift)
  }

  def main(args: Array[String]): Unit = {
    val plaintext = "Hello, World!"
    val shift = 3

    val encrypted = cipher(plaintext, shift, encrypt)
    println(s"Encrypted: $encrypted") //"Khoor, Zruog!"

    val decrypted = cipher(encrypted, shift, decrypt)
    println(s"Decrypted: $decrypted") //"Hello, World!"
  }
}
