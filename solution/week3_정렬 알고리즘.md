# 정렬 알고리즘
### 시간복잡도 $O(n^2)$인 정렬
1. [선택 정렬(Selection Sort)](#1-선택-정렬)
2. [삽입 정렬(Insertion Sort)](#2-삽입-정렬)
3. [버블 정렬(Bubble Sort)](#3-버블-정렬)


* 크기가 n인 배열을 선택 정렬 하는 경우 n개의 원소 중 최소 값을 찾는 연산을 n번 실행하므로 시간복잡도는 $O(n^2)$이다.  
* 주어진 배열만을 사용하므로 공간복잡도는 $O(1)$이다.

### 공통 함수
```java
/**
 * 원소 교환 함수
 * idx1번째 원소와 idx2번째 원소 교환
 */
private void swap(int[] array, int idx1, int idx2){
    int tmp = array[idx1];
    array[idx1] = array[idx2];
    array[idx2] = tmp;
}
```

## 1. 선택 정렬
> 배열에서 가장 작은 값의 원소를 찾아 맨 앞의 원소와 교환하는 정렬 방식이다.

![image](https://user-images.githubusercontent.com/56745491/220225415-a27ddd72-bc1b-4069-ab42-994448b9b011.png)

```java
/**
 * 선택 정렬 함수
 * array[n] - 크기 n의 배열이 있다고 가정
 */
private void selectionSort(int[] array){
    for(int i=0;i<array.length-1;i++){

        int minIdx = i; // 최소값 index

        // 최소값 탐색
        for(int j=i+1;j<array.length;j++){
            if(array[minIdx] > array[j]){
                minIdx = j;
            }
        }

        // 최소값을 갖는 원소와 i번째 원소와 교환
        swap(array, minIdx, i);
    }
}
```

## 2. 삽입 정렬
> 순서대로 원소와 원소 이전의 값들을 비교하여 원소의 위치를 찾아 삽입하는 정렬 방식이다.

![image](https://user-images.githubusercontent.com/56745491/220225529-c0022c56-bc89-4b7a-9d65-503909c359de.png)


```java
/**
 * 삽입 정렬 함수
 * array[n] - 크기 n의 배열이 있다고 가정
 */
private void insertionSort(int[] array){
    for(int i=1;i<array.length;i++){
        
        int element = array[i]; // 삽입하려는 원소

        // 원소 이전의 값과 비교
        for(int j=0;j<i;j++){
            if(element < array[j]){// 삽입하려는 원소보다 큰 원소인 경우
                swap(array, i, j); // index 변경
            }
        }
    }
}
```

## 3. 버블 정렬
> 원소를 두개씩 비교하여 정렬하는 연산을 배열의 처음부터 끝까지 반복하는 정렬 방식이다.

![image](https://user-images.githubusercontent.com/56745491/220225804-3108a3ec-efc1-4930-b260-2fc6fcbacc00.png)


```java
/**
 * 버블 정렬 함수
 * array[n] - 크기 n의 배열이 있다고 가정
 */
private void bubbleSort(int[] array){
    for(int i=1;i<array.length;i++){
        for(int j=0;j<array.length-i;j++){
            if(array[j] > array[j+1]){// 두개씩 비교 후
                swap(array, j, j+1);  // 필요한 경우 원소 교환
            }
        }
    }
}
```
