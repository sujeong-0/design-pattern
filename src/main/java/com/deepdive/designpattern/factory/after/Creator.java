package com.deepdive.designpattern.factory.after;


/**
 * 이 클래스는 생산자를 담당합니다.
 */
public interface Creator {


	/**
	 * product를 생성하는 일련의 과정
	 * @return
	 */
	default Product createProduct() {
		before();
		Product product = factoryMethod();
		System.out.println("["+ product.name + "]  생성 ");
		after();
		return product;
	}

	private void before() {
		System.out.println("Product를 생성하기전에 해야하는 과정");
	}
	private void after() {

		System.out.println("Product를 생성한 후에 해야하는 과정");
	}

	/**
	 * Product를 생산하는 메서드
	 * @return 생산된 제품
	 */
	Product factoryMethod();
}
