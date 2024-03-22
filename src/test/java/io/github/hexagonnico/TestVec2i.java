package io.github.hexagonnico;

import io.github.hexagonnico.vecmatlib.vector.Vec2i;
import org.junit.Assert;
import org.junit.Test;

public class TestVec2i {

    @Test
    public void testSumOfTwoVectors() {
        var a = new Vec2i(1, 2);
        var b = new Vec2i(2, 3);
        var res = new Vec2i(3, 5);
        Assert.assertEquals(res, a.plus(b));
    }

    @Test
    public void testSumVectorValues() {
        var v1 = new Vec2i(1, 2);
        var v2 = v1.plus(2, 3);
        var res = new Vec2i(3, 5);
        Assert.assertEquals(res, v2);
    }

    @Test
    public void testSubtractionOfTwoVectors() {
        var a = new Vec2i(3, 5);
        var b = new Vec2i(2, 3);
        var res = new Vec2i(1, 2);
        Assert.assertEquals(res, a.minus(b));
    }

    @Test
    public void testSubtractionVectorValues() {
        var v1 = new Vec2i(3, 5);
        var v2 = v1.minus(2, 3);
        var res = new Vec2i(1, 2);
        Assert.assertEquals(res, v2);
    }

    @Test
    public void testNegated() {
        var vec = new Vec2i(1, -2);
        var res = new Vec2i(-1, 2);
        Assert.assertEquals(res, vec.negated());
    }

    @Test
    public void testComponentWiseVectorMultiplication() {
        var a = new Vec2i(2, 3);
        var b = new Vec2i(3, 4);
        var res = new Vec2i(6, 12);
        Assert.assertEquals(res, a.multiply(b));
    }

    @Test
    public void testComponentWiseValuesMultiplication() {
        var v1 = new Vec2i(2, 3);
        var v2 = v1.multiply(3, 4);
        var res = new Vec2i(6, 12);
        Assert.assertEquals(res, v2);
    }

    @Test
    public void testVectorScalarMultiplication() {
        var v1 = new Vec2i(1, 2);
        var v2 = v1.multipliedBy(2);
        var res = new Vec2i(2, 4);
        Assert.assertEquals(res, v2);
    }

    @Test
    public void testComponentWiseVectorDivision() {
        var a = new Vec2i(6, 12);
        var b = new Vec2i(3, 4);
        var res = new Vec2i(2, 3);
        Assert.assertEquals(res, a.divide(b));
    }

    @Test
    public void testComponentWiseValuesDivision() {
        var v1 = new Vec2i(6, 12);
        var v2 = v1.divide(3, 4);
        var res = new Vec2i(2, 3);
        Assert.assertEquals(res, v2);
    }

    @Test
    public void testVectorScalarDivision() {
        var v1 = new Vec2i(1, 2);
        var v2 = v1.dividedBy(2);
        var res = new Vec2i(0, 1);
        Assert.assertEquals(res, v2);
    }

    @Test
    public void testComponentWiseVectorMod() {
        var a = new Vec2i(1, 8);
        var b = new Vec2i(2, 3);
        var res = new Vec2i(1, 2);
        Assert.assertEquals(res, a.mod(b));
    }

    @Test
    public void testComponentWiseValuesMod() {
        var v1 = new Vec2i(1, 8);
        var v2 = v1.mod(2, 3);
        var res = new Vec2i(1, 2);
        Assert.assertEquals(res, v2);
    }

    @Test
    public void testVectorScalarMod() {
        var v1 = new Vec2i(1, 8);
        var v2 = v1.mod(3);
        var res = new Vec2i(1, 2);
        Assert.assertEquals(res, v2);
    }

    @Test
    public void testVectorEqualsTwoValues() {
        var vec = new Vec2i(1, 2);
        Assert.assertTrue(vec.equals(1, 2));
    }
}
