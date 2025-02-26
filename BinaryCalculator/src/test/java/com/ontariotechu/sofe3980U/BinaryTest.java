package com.ontariotechu.sofe3980U;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;;

/**
 * Unit test for Binary class.
 */
public class BinaryTest 
{
    /**
     * Test The constructor with a valid binary vallue
     */
    @Test
    public void normalConstructor()
    {
		Binary binary = new Binary("1001001");
        assertTrue( binary.getValue().equals("1001001"));
    }
    /**
     * Test The constructor with an invalid binary value of out-of-range digits
     */
    @Test
    public void constructorWithInvalidDigits()
    {
		Binary binary = new Binary("1001001211");
        assertTrue( binary.getValue().equals("0"));
    }
    /**
     * Test The constructor with an invalid binary value of alphabetic characters
     */
    @Test
    public void constructorWithInvalidChars()
    {
		Binary binary = new Binary("1001001A");
        assertTrue( binary.getValue().equals("0"));
    }
    /**
     * Test The constructor with an invalid binary value that has a sign
     */
    @Test
    public void constructorWithNegativeSign()
    {
		Binary binary = new Binary("-1001001");
        assertTrue( binary.getValue().equals("0"));
    }
    /**
     * Test The constructor with a zero tailing valid binary value
     */
    @Test
    public void constructorWithZeroTailing()
    {
		Binary binary = new Binary("00001001");
        assertTrue( binary.getValue().equals("1001"));
    }
    /**
     * Test The constructor with an empty string
     */
    @Test
    public void constructorEmptyString()
    {
		Binary binary = new Binary("");
        assertTrue( binary.getValue().equals("0"));
    }
	/**
     * Test The add functions with two binary numbers of the same length
     */
    @Test
    public void add()
    {
		Binary binary1 = new Binary("1000");
		Binary binary2 = new Binary("1111");
		Binary binary3 = Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("10111"));
    }
	/**
     * Test The add functions with two binary numbers, the length of the first argument is less than the second
     */
    @Test
    public void add2()
    {
		Binary binary1 = new Binary("1010");
		Binary binary2 = new Binary("11");
		Binary binary3 = Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("1101"));
    }
	/**
     * Test The add functions with two binary numbers, the length of the first argument is greater than the second
     */
    @Test
    public void add3()
    {
		Binary binary1 = new Binary("11");
		Binary binary2 = new Binary("1010");
		Binary binary3 = Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("1101"));
    }
	/**
     * Test The add functions with a binary numbers with zero
     */
    @Test
    public void add4()
    {
		Binary binary1 = new Binary("0");
		Binary binary2 = new Binary("1010");
		Binary binary3 = Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("1010"));
    }
	/**
     * Test The add functions with two zeros
     */
    @Test
    public void add5()
    {
		Binary binary1 = new Binary("0");
		Binary binary2 = new Binary("0");
		Binary binary3 = Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("0"));
    }
    /**
     * Testing or function with different binary lengths
     */
    @Test
    public void orDiffLen()
    {
        Binary binary1 = new Binary("1101");
        Binary binary2 = new Binary("1");
        Binary binary3 = Binary.or(binary1, binary2);
        
        assertTrue(binary3.getValue().equals("1101"));
    }
    /**
     * Testing or function with the same binary lengths
     */
    @Test
    public void orSameLen()
    {
        Binary binary1 = new Binary("101");
        Binary binary2 = new Binary("001");
        Binary binary3 = Binary.or(binary1, binary2);
        
        assertTrue(binary3.getValue().equals("101"));
    }
    /**
     * Testing or function with all zeros
     */
    @Test
    public void orAllZero()
    {
        Binary binary1 = new Binary("0");
        Binary binary2 = new Binary("0");
        Binary binary3 = Binary.or(binary1, binary2);
        
        assertTrue(binary3.getValue().equals("0"));
    }
    /**
     * Testing or function with all ones
     */
    @Test
    public void orAllOne()
    {
        Binary binary1 = new Binary("1111");
        Binary binary2 = new Binary("1");
        Binary binary3 = Binary.or(binary1, binary2);
        
        assertTrue(binary3.getValue().equals("1111"));
    }
    /**
     * Testing and function with different binary lengths
     */
    @Test
    public void andDiffLen()
    {
        Binary binary1 = new Binary("1101");
        Binary binary2 = new Binary("1");
        Binary binary3 = Binary.and(binary1, binary2);
        
        assertTrue(binary3.getValue().equals("1"));
    }
    /**
     * Testing and function with the same binary lengths
     */
    @Test
    public void andSameLen()
    {
        Binary binary1 = new Binary("101");
        Binary binary2 = new Binary("101");
        Binary binary3 = Binary.and(binary1, binary2);
        
        assertTrue(binary3.getValue().equals("101"));
    }
    /**
     * Testing and function with all zeros
     */
    @Test
    public void andAllZero()
    {
        Binary binary1 = new Binary("0");
        Binary binary2 = new Binary("0");
        Binary binary3 = Binary.and(binary1, binary2);
        
        assertTrue(binary3.getValue().equals("0"));
    }
    /**
     * Testing and function with all ones
     */
    @Test
    public void andAllOne()
    {
        Binary binary1 = new Binary("1111");
        Binary binary2 = new Binary("1");
        Binary binary3 = Binary.and(binary1, binary2);
        
        assertTrue(binary3.getValue().equals("1"));
    }
    /**
     * Testing general multiplication functionality
     */
    @Test
    public void multiply() {
        Binary binary1 = new Binary("101");   
        Binary binary2 = new Binary("11");    
        Binary binary3 = Binary.multiply(binary1, binary2);
        
        assertTrue(binary3.getValue().equals("1111"));
    }
    /**
     * Testing multiply by zero
     */
    @Test
    public void multiplyZero() {
        Binary binary1 = new Binary("1111");   
        Binary binary2 = new Binary("0");    
        Binary binary3 = Binary.multiply(binary1, binary2);
        
        assertTrue(binary3.getValue().equals("0"));
    }
    /**
     * Testing multiply by one
     */
    @Test
    public void multiplyOne() {
        Binary binary1 = new Binary("1001");   
        Binary binary2 = new Binary("1");    
        Binary binary3 = Binary.multiply(binary1, binary2);
        
        assertTrue(binary3.getValue().equals("1001"));
    }
}