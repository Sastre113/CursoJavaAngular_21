/**
 * 
 */
package test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import JUnit.Junit09_Geometria.dto.Geometria;

/**
 * @author Miguel Á. Sastre
 *
 */


/*
 * Notas de autor:
 * 
 * 
 *	Preguntas: ¿ Los valores pasados en los tests deben ser estaticos o pueden generarse
 *		aleatoriamente cada vez que se llame al test ? 
 *			En caso afirmativo, ¿Lista de argumentos aleatorios?
 */
class GeometriaTest {

	Geometria geo;
	
	@BeforeEach
	public void before() {
		System.out.println("Before()");
		geo = new Geometria();
	}
	
	/*
	 * Test parametrizado pasandole una colección de argumentos
	 */
	
	private static Stream<Integer> getAllOptionID(){
		return Stream.of(1,2,3,4,5,6,7,8,9);
	}
	
	@ParameterizedTest
	@MethodSource("getAllOptionID")
	public void testConstrutorGeometriaId(int id) {
		geo = new Geometria(id);
	}
	
	/*
	 * Un Test básico
	 */
	
	@Test
	public void testAreaCuadrado() {
		int result = geo.areacuadrado(2);
		int expected = 4;
		assertEquals(expected,result);
	}
		
	/*
	 * Test parametrizado mediante "ValueSource"
	 */
	
	@ParameterizedTest
	@ValueSource(ints = {1, 3, 5, -3, 15, Integer.MAX_VALUE})
	public void testAreaCirculo(int r) {
		double result = geo.areaCirculo(r);
		double expected = Math.PI * Math.pow(r, 2);
		int delta = 1;
		assertEquals(expected,result,delta);
	}
	
	
	/*
	 * Test parametrizado individualizado al estilo List de argumentos
	 */
	
	private static Stream<Arguments> getValoresTestAreaTriangulo(){
		int min = -10, max = 10;
		List listaArgumentos = List.of(
				Arguments.of(numeroAleatorio(min,max),numeroAleatorio(min,max)),
				Arguments.of(numeroAleatorio(min,max),numeroAleatorio(min,max)),
				Arguments.of(10,5),
				Arguments.of(-5,10)	
						);
		
		return listaArgumentos.stream();
	}
	
	
	@ParameterizedTest
	@MethodSource("getValoresTestAreaTriangulo")
	public void testAreaTriangulo(int a, int b) {
		double result = geo.areatriangulo(a,b);
		double expected = Math.abs((a*b)/2);
		int delta = 1;
		assertEquals(expected,result,delta);
	}
	
	
	@ParameterizedTest
	@MethodSource("getValoresAleatoriosTest")
	public void testAreaRectangulo(int a, int b) {
		double result = geo.arearectangulo(a,b);
		double expected = Math.abs(a*b);
		int delta = 1;
		assertEquals(expected,result,delta);
	}
	
	@ParameterizedTest
	@MethodSource("getValoresFijosTest")
	public void testAreaPentagono(int p, int a) {
		double result = geo.areapentagono(p, a);
		double expected = Math.abs((p*a)/2);
		int delta = 1;
		assertEquals(expected,result,delta);
	}
	
	
	@ParameterizedTest
	@MethodSource("getValoresFijosTest")
	public void testAreaRombo(int D, int d) {
		double result = geo.arearombo(D, d);
		double expected = Math.abs((D*d)/2);
		int delta = 1;
		assertEquals(expected,result,delta);
	}
	
	@ParameterizedTest
	@MethodSource("getValoresFijosTest")
	public void testAreaRomboide(int b, int h) {
		double result = geo.arearomboide(b, h);
		double expected = Math.abs(b*h);
		int delta = 1;
		assertEquals(expected,result,delta);
	}
	
	
	@DisplayName("Area del trapecio")
	@ParameterizedTest(name = "{index} => B={0}, b={1}, h={2}")
    @CsvSource({
            "5, 2, 10",
            "10, 5, 3",
            "12, 15, 14",
            "-6, 4, 25",
            "15, -3, -10"
    })
	public void testAreaTrapecio(int B, int b, int h) {
		double result = geo.areatrapecio(B,b,h);
		double expected = Math.abs(((B+b)/2)*h);
		int delta = 1;
		assertEquals(expected,result,delta);
	}
	
	@Test
	public void testGetId() {
			int result = geo.getId();
			assertTrue(result > 0 && result < 10);
	}
	
	
	@ParameterizedTest
	@ValueSource(ints = {1, 3, 5, -3, 15})
	public void testSetId(int id) {
		int result;
		geo.setId(id);
		result = geo.getId();
		assertTrue(id == result);
	}
	
	@Test
	public void testGetNom() {
			String result = geo.getNom();
			int i = 0;
			boolean encontrado = false;
			do {
				encontrado = geo.figura(i).compareToIgnoreCase(result) == 0;
				i++;
			}while(i < 9 && !encontrado);
			assertTrue(encontrado);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"Triangulo","Piedra"})
	public void testSetNom(String nom) {
		String result;
		geo.setNom(nom);
		result = geo.getNom();
		assertTrue(nom.compareToIgnoreCase(result) == 0);
	}
	
	
	@Test
	public void testGetArea() {
			int result = geo.getId();
			assertTrue(result > 0 && result < 10);
	}
	
	
	@ParameterizedTest
	@ValueSource(doubles = {1, 3, 5, -3, 15})
	public void testSetArea(double area) {
		double result;
		geo.setArea(area);
		result = geo.getArea();
		assertTrue(area == result);
	}
	
	@Test
	public void testToString() {
		assertTrue(geo.toString() instanceof String);
	}
	
	/*
	 * Métodos auxiliares
	 */
	
	private static Stream<Arguments> getValoresAleatoriosTest(){
		int min = -10, max = 10;	
		List listaArgumentos = List.of(
				Arguments.of(numeroAleatorio(),numeroAleatorio()),
				Arguments.of(numeroAleatorio(),numeroAleatorio()),
				Arguments.of(numeroAleatorio(min,max),numeroAleatorio(min,max)),
				Arguments.of(numeroAleatorio(min,max),numeroAleatorio(min,max))	
						);
		
		return listaArgumentos.stream();
	}
	
	private static Stream<Arguments> getValoresFijosTest(){
		int min = -10, max = 10;
		List listaArgumentos = List.of(
				Arguments.of(-1,10),
				Arguments.of(2,36),
				Arguments.of(5,7),
				Arguments.of(13,11)	
						);
		
		return listaArgumentos.stream();
	}
	
	
	@SuppressWarnings("unused")
	private static int numeroAleatorio() {
		return numeroAleatorio(0,100);
	}
	private static int numeroAleatorio(int min, int max) {
		return new Random().nextInt(max - min) + min;
	}
	
	
}
