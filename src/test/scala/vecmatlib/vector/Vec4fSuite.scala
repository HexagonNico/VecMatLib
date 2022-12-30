package vecmatlib.vector

import org.scalatest.funsuite.AnyFunSuite

class Vec4fSuite extends AnyFunSuite {

  test("Test plus 1") {
    val vec = Vec4f(1.0f, 2.0f, 3.0f, 4.0f)
    val res = vec + (2.0f, 3.0f, 1.0f, -1.0f)
    assert(res == Vec4f(3.0f, 5.0f, 4.0f, 3.0f))
  }

  test("Test plus 2") {
    val vec = Vec4f(1.0f, 2.0f, 3.0f, 4.0f)
    val res = vec + (2.0, 3.0, 1.0, -1.0)
    assert(res == Vec4d(3.0, 5.0, 4.0, 3.0))
  }

  test("Test plus 3") {
    val a = Vec4f(1.0f, 2.0f, 3.0f, 4.0f)
    val b = Vec4i(2, 3, 1, -1)
    assert(a + b == Vec4f(3.0f, 5.0f, 4.0f, 3.0f))
  }

  test("Test plus 4") {
    val a = Vec4f(1.0f, 2.0f, 3.0f, 4.0f)
    val b = Vec4f(2.0f, 3.0f, 1.0f, -1.0f)
    assert(a + b == Vec4f(3.0f, 5.0f, 4.0f, 3.0f))
  }

  test("Test plus 5") {
    val a = Vec4f(1.0f, 2.0f, 3.0f, 4.0f)
    val b = Vec4d(2.0, 3.0, 1.0, -1.0)
    assert(a + b == Vec4d(3.0, 5.0, 4.0, 3.0))
  }

  test("Test negated") {
    val a = Vec4f(2.0f, 3.0f, 4.0f, -2.0f)
    assert(-a == Vec4f(-2.0f, -3.0f, -4.0f, 2.0f))
  }

  test("Test minus 1") {
    val vec = Vec4f(3.0f, 5.0f, 4.0f, 2.0f)
    val res = vec - (2.0f, 3.0f, 1.0f, 4.0f)
    assert(res == Vec4f(1.0f, 2.0f, 3.0f, -2.0f))
  }

  test("Test minus 2") {
    val vec = Vec4f(3.0f, 5.0f, 4.0f, 2.0f)
    val res = vec - (2.0, 3.0, 1.0, 4.0)
    assert(res == Vec4d(1.0, 2.0, 3.0, -2.0))
  }

  test("Test minus 3") {
    val a = Vec4f(3.0f, 5.0f, 4.0f, 2.0f)
    val b = Vec4i(2, 3, 1, 4)
    assert(a - b == Vec4f(1.0f, 2.0f, 3.0f, -2.0f))
  }

  test("Test minus 4") {
    val a = Vec4f(3.0f, 5.0f, 4.0f, 2.0f)
    val b = Vec4f(2.0f, 3.0f, 1.0f, 4.0f)
    assert(a - b == Vec4f(1.0f, 2.0f, 3.0f, -2.0f))
  }

  test("Test minus 5") {
    val a = Vec4f(3.0f, 5.0f, 4.0f, 2.0f)
    val b = Vec4d(2.0, 3.0, 1.0, 4.0)
    assert(a - b == Vec4d(1.0, 2.0, 3.0, -2.0))
  }

  test("Test multipliedBy 1") {
    val vec = Vec4f(1.0f, 2.0f, 3.0f, 4.0f)
    val res = vec * 1.5f
    assert(res == Vec4f(1.5f, 3.0f, 4.5f, 6.0f))
  }

  test("Test multipliedBy 2") {
    val vec = Vec4f(1.0f, 2.0f, 3.0f, 4.0f)
    val res = vec * 1.5
    assert(res == Vec4d(1.5, 3.0, 4.5, 6.0))
  }

  test("Test dividedBy 1") {
    val vec = Vec4f(1.0f, 2.0f, 3.0f, 4.0f)
    val res = vec / 2.0f
    assert(res == Vec4f(0.5f, 1.0f, 1.5f, 2.0f))
  }

  test("Test dividedBy 2") {
    val vec = Vec4f(1.0f, 2.0f, 3.0f, 4.0f)
    val res = vec / 2.0
    assert(res == Vec4d(0.5, 1.0, 1.5, 2.0))
  }

  test("Test multiply 1") {
    val vec = Vec4f(2.0f, 3.0f, 4.0f, 1.0f)
    val res = vec * (3.0f, 4.0f, 2.0f, 1.0f)
    assert(res == Vec4f(6.0f, 12.0f, 8.0f, 1.0f))
  }

  test("Test multiply 2") {
    val vec = Vec4f(2.0f, 3.0f, 4.0f, 1.0f)
    val res = vec * (3.0, 4.0, 2.0, 1.0)
    assert(res == Vec4d(6.0, 12.0, 8.0, 1.0))
  }

  test("Test multiply 3") {
    val a = Vec4f(2.0f, 3.0f, 4.0f, 1.0f)
    val b = Vec4i(3, 4, 2, 1)
    assert(a * b == Vec4f(6.0f, 12.0f, 8.0f, 1.0f))
  }

  test("Test multiply 4") {
    val a = Vec4f(2.0f, 3.0f, 4.0f, 1.0f)
    val b = Vec4f(3.0f, 4.0f, 2.0f, 1.0f)
    assert(a * b == Vec4f(6.0f, 12.0f, 8.0f, 1.0f))
  }

  test("Test multiply 5") {
    val a = Vec4f(2.0f, 3.0f, 4.0f, 1.0f)
    val b = Vec4d(3.0, 4.0, 2.0, 1.0)
    assert(a * b == Vec4d(6.0, 12.0, 8.0, 1.0))
  }

  test("Test dot 1") {
    val vec = Vec4f(1.0f, 2.0f, 3.0f, 4.0f)
    val res = vec dot(2.0f, 3.0f, 1.0f, 4.0f)
    assert(res == 27.0f)
  }

  test("Test dot 2") {
    val vec = Vec4f(1.0f, 2.0f, 3.0f, 4.0f)
    val res = vec dot(2.0, 3.0, 1.0, 4.0)
    assert(res == 27.0)
  }

  test("Test dot 3") {
    val a = Vec4f(1.0f, 2.0f, 3.0f, 4.0f)
    val b = Vec4i(2, 3, 1, 4)
    assert((a dot b) == 27.0f)
  }

  test("Test dot 4") {
    val a = Vec4f(1.0f, 2.0f, 3.0f, 4.0f)
    val b = Vec4f(2.0f, 3.0f, 1.0f, 4.0f)
    assert((a dot b) == 27.0f)
  }

  test("Test dot 5") {
    val a = Vec4f(1.0f, 2.0f, 3.0f, 4.0f)
    val b = Vec4d(2.0, 3.0, 1.0, 4.0)
    assert((a dot b) == 27.0)
  }

  test("Test length squared") {
    assert(Vec4f(1.0f, 1.0f, 1.0f, 1.0f).lengthSquared == 4.0f)
  }

  test("Test length") {
    assert(Vec4f(1.0f, 1.0f, 1.0f, 1.0f).length == Math.sqrt(4))
  }

  test("Test normalized") {
    val vec = Vec4f(4.0f, 0.0f, 0.0f, 0.0f)
    val res = vec.normalized
    assert(res == Vec4d(1.0, 0.0, 0.0, 0.0))
  }
}
