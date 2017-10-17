package icc.chatter

/**
  * Represents a brain that can...
  * process information into knowledge
  * and
  * generate thought based on knowledge and Context.
  */
object Brain {

  /**
    * Digests a message and expands the knowledge accordingly.
    * @param knowledge Knowledge so far.
    * @param message   The message that is being digested.
    * @return          The knowledge expanded by the digested message.
    */
  def digest(knowledge: Knowledge, message: String): Knowledge = {
    knowledge
  }

  /**
    * Generates a thought.
    * @param knowledge The knowledge used in the generation of the thought.
    * @param context   The context used when generating the thought.
    * @return          A thought.
    */
  def think(knowledge: Knowledge, context: Context): String = {
    ""
  }
}
