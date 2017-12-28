package cz.zcu.kiv.fjp.compiler;

import cz.zcu.kiv.fjp.TestData;
import cz.zcu.kiv.fjp.compiler.compilers.CompilerData;
import cz.zcu.kiv.fjp.instruction.InstructionHandler;
import cz.zcu.kiv.fjp.interpret.Interpreter;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static cz.zcu.kiv.fjp.TestData.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(PowerMockRunner.class)
@PrepareForTest(InstructionHandler.class)
public class TestComplex {


    @Rule
    public final TextFromStandardInputStream systemInMock
            = emptyStandardInputStream();
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog().mute();
    private InstructionHandler instructionHandler = mock(InstructionHandler.class);
    private File instructionFile = mock(File.class);
    private Interpreter interpreter = Interpreter.getInstance();

    @Before
    public void setUp() {
        CompilerData.currentLevel = 0;
        CompilerData.instructionList.clear();
        CompilerData.symbolTable.clearTable();
        CompilerData.gotoList.clear();
        CompilerData.currentAddress = 0;
        CompilerData.declarationCounter = 0;

        PowerMockito.mockStatic(InstructionHandler.class);
        PowerMockito.when(InstructionHandler.getInstance()).thenReturn(instructionHandler);

        try {
            when(instructionHandler.parseFile(any(File.class))).thenReturn(CompilerData.instructionList);
        } catch (IOException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void TestArmstrong() {


        file = TestData.COMPILER_COMPLEX_ARMSTRONG;
        testANTLRfile();
        compileTree();


        try {

            for (int i = 0; i < ArmstrongNumbers.length; i++) {

                systemInMock.provideLines(String.valueOf(ArmstrongNumbers[i][0]));
                interpreter.interpret(instructionFile, false, null, true);

                assertEquals("Error in number " + ArmstrongNumbers[i][0], String.valueOf(ArmstrongNumbers[i][1]), systemOutRule.getLog().trim());
                systemOutRule.clearLog();
            }
        } catch (Exception e) {
            fail(e.getMessage());
        }


    }

    @Test
    public void TestFactorial() {
        file = TestData.COMPILER_COMPLEX_FACTORIAL;
        testANTLRfile();
        compileTree();


        try {

            for (int i = 0; i < FactorialNumbers.length; i++) {

                systemInMock.provideLines(String.valueOf(FactorialNumbers[i][0]));
                interpreter.interpret(instructionFile, false, null, true);

                assertEquals("Error in number " + FactorialNumbers[i][0], String.valueOf(FactorialNumbers[i][1]), systemOutRule.getLog().trim());
                systemOutRule.clearLog();

            }


        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

    @Test
    public void TestFahrenheit() {
        file = TestData.COMPILER_COMPLEX_FAHRENHEIT;
        testANTLRfile();
        compileTree();

        try {

            for (int i = 0; i < FahrenheitNumbers.length; i++) {

                systemInMock.provideLines(String.valueOf(FahrenheitNumbers[i][0]));
                interpreter.interpret(instructionFile, false, null, true);

                assertEquals("Error in number " + FahrenheitNumbers[i][0], String.valueOf(FahrenheitNumbers[i][1]), systemOutRule.getLog().trim());
                systemOutRule.clearLog();

            }


        } catch (Exception e) {
            fail(e.getMessage());
        }


    }

    @Test
    public void TestFibonacci() {
        file = TestData.COMPILER_COMPLEX_FIBONACCI;
        testANTLRfile();
        compileTree();

        try {

            systemInMock.provideLines(String.valueOf(FibonacciNumbers[0][0]));
            interpreter.interpret(instructionFile, false, null, true);
            String str = systemOutRule.getLog().replaceAll("[^-?0-9]+", " ");

            List<String> fibonacci = Arrays.asList(str.trim().split(" "));

            System.out.println(fibonacci.toString());

            for (int i = 1; i < fibonacci.size(); i++) {

                assertEquals("Fibonacci series error", String.valueOf(FibonacciNumbers[0][i]), fibonacci.get(i - 1));

            }

        } catch (Exception e) {
            fail(e.getMessage());
        }


    }

    @Test
    public void TestPalindrome() {
        file = TestData.COMPILER_COMPLEX_PALINDROME;
        testANTLRfile();
        compileTree();


        try {

            for (int i = 0; i < PalindromeNumbers.length; i++) {

                systemInMock.provideLines(String.valueOf(PalindromeNumbers[i][0]));
                interpreter.interpret(instructionFile, false, null, true);

                assertEquals("Error in number " + PalindromeNumbers[i][0], String.valueOf(PalindromeNumbers[i][1]), systemOutRule.getLog().trim());
                systemOutRule.clearLog();

            }


        } catch (Exception e) {
            fail(e.getMessage());
        }

    }


    @Test
    public void TestPrime() {
        file = TestData.COMPILER_COMPLEX_PRIME;
        testANTLRfile();
        compileTree();


        try {

            for (int i = 0; i < PrimeNumbers.length; i++) {

                systemInMock.provideLines(String.valueOf(PrimeNumbers[i][0]));
                interpreter.interpret(instructionFile, false, null, true);

                assertEquals("Error in number " + PrimeNumbers[i][0], String.valueOf(PrimeNumbers[i][1]), systemOutRule.getLog().trim());
                systemOutRule.clearLog();

            }


        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

}
