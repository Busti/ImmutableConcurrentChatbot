package icc.util

import scala.collection.mutable

class FrequencyMap[T] {
  case class Entry(word: T, frequency: Int, previous: Entry, next: Entry)

  val map: mutable.Map[T, Entry] = mutable.Map()
  var last: Entry

  def put(v: T) {
    val entry = map.getOrElseUpdate(v, Entry(v, 0, null, last.next))
    val next = entry.next
    entry.frequency += 1
    if (entry.frequency >= entry.next.frequency) {
      entry.next = next.next
    }
  }
}
