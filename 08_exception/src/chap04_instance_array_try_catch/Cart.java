package chap04_instance_array_try_catch;

import chap05_instance_array_throws.Product;

public class Cart {
  
  // 필드
  private Product[] products; //----- Product[] 배열 선언(배열의 생성이 필요합니다.)
  private int count;         //------ products 배열에 저장된 Product 개수
  private final int LIMIT = 100;//-- products 배열의 최대길이 (final 상수 : 값을 바꿀 수 없습니다. 반드시 초기화가 필요합니다. 관례상 대문자로 작성합니다.)
  //생성자
  public Cart() {
    // new Cart() 실행 시 products 배열이 생성됩니다.
    products = new Product[LIMIT];
  }
  
  
  //메소드
  
  public Product[] getProducts() {
    return products;
  }
  public void setProducts(Product[] products) {
    this.products = products;
  }
  public int getCount() {
    return count;
  }
  public void setCount(int count) {
    this.count = count;
  }
  
  public void addProduct(Product product) {
    // 예외 발생 후 예외 처리하기
    try {
    if (product == null) {
      throw new RuntimeException("전달된 Product이 없습니다.");
    }
    if (count == LIMIT ) {
      throw new RuntimeException("더 이상 Cart에 담을 수 없습니다.");
    }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
  
  public Product removeProduct(int idx) {
    // 예외 발생 후 예외 처리하기
    Product removed = null;
    try {
    if (count == 0) {
      throw new RuntimeException("Cart가 비어있습니다.");
    }
    if (idx < 0 || idx > count) {
      throw new RuntimeException(idx + "는 없는 인덱스입니다.");
    }
    removed = products[idx]; //----- 삭제된 요소 (현재는 삭제 될 요소)
      System.arraycopy(products, idx + 1, products, idx, count - idx - 1);
      products[--count] = null;

    }catch(Exception e){
      System.out.println(e.getMessage());
    }
    return removed; //--------------------- 삭제된 요소 반환

  }
    /*
     * 1) Product이 9개 저장된 products 배열
     * 
     * +-------+-------+-------+-------+-------+-------+-------+-------+-------+-------+
     * |  p01  |  p02  |  p03  |  p04  |  p05  |  p06  |  p07  |  p08  |  p09  |  null |
     * +-------+-------+-------+-------+-------+-------+-------+-------+-------+-------+
     *                             ↑                                               ↑
     *                            idx (remove target)                            count
     * 
     * 
     * 
     * 2) 삭제를 위해 삭제할 요소 뒤의 하나씩 앞으로 복사해오기
     * 
     *                                   begin                            end             // 복사할 데이터의 개수: end - begin + 1 
     *                                 +-------+                      +---------+
     *                                 |idx + 1|                      |count - 1|         // 복사할 데이터의 개수: (count - 1) - (idx + 1) + 1 == count - idx - 1
     *                                 +-------+                      +---------+
     *                                     ↓                               ↓
     * +-------+-------+-------+-------+=======+=======+=======+=======+=======+-------+
     * |  p01  |  p02  |  p03  |  p04  ║  p05  |  p06  |  p07  |  p08  |  p09  ║ null  |  // FROM products[idx + 1]
     * +-------+-------+-------+-------+=======+=======+=======+=======+=======+-------+
     *                                  ↙       ↙       ↙       ↙       ↙
     *                                ↙ COPY  ↙ COPY  ↙ COPY  ↙ COPY  ↙
     *                              ↙       ↙       ↙       ↙       ↙
     * +-------+-------+-------+=======+=======+=======+=======+=======+-------+-------+
     * |  p01  |  p02  |  p03  ║  p05  |  p06  |  p07  |  p08  |  p09  ║  p09  | null  |  // TO products[idx]
     * +-------+-------+-------+=======+=======+=======+=======+=======+-------+-------+
     *                             ↑
     *                          +-----+
     *                          | idx |
     *                          +-----+
     * 
     * 
     * 
     *  3) 마지막 요소를 null 처리하고 count 감소하기
     *  
     * +-------+-------+-------+=======+=======+=======+=======+=======+-------+-------+
     * |  p01  |  p02  |  p03  ║  p05  |  p06  |  p07  |  p08  |  p09  ║ null  | null  |
     * +-------+-------+-------+=======+=======+=======+=======+=======+-------+-------+
     *                                                                     ↑
     *                                                                   count
     *                                                         +-------------------------+
     *                                                         |products[--count] = null;|
     *                                                         +-------------------------+
     */


    //               -----------------  -------------  ---------------
    //               FROM               TO             복사할 요소의 개수
    

  

  
}
