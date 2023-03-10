package vecmatlib

/**
 * Trait that represents a 4-dimensional float tuple
 */
trait Float4 extends Float3 {

  /**
   * W component.
   *
   * @return The W component of this tuple
   */
  def w: Float
}
