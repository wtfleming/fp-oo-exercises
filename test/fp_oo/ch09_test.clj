(ns fp-oo.ch09-test
  (:require [clojure.test :refer :all]
            [fp-oo.ch09 :refer :all]))

(deftest exercise-1-1-test
  (testing "exercise-1-1"
    (let [result (exercise-1-1 [1 2 3])]
      (is (= result [3 4 5])))))

(deftest exercise-1-2-test
  (testing "exercise-1-2"
    (let [result (exercise-1-2 [1 2 3])]
      (is (= result [3 4 5])))))

(deftest exercise-2-test
  (testing "exercise-2"
    (let [result (exercise-2 [1 2 3 4 5])]
      (is (= result [[1 3 5] [2 4]])))))

(deftest exercise-5-test
  (testing "exercise-5"
    (let [result (exercise-5 33)]
      (is (= result 33)))))

(deftest exercise-6-test
  (testing "exercise-6"
    (let [result (exercise-6)]
      (is (= result 8)))))

;;; Exercise 7
(deftest isbn-checksum-test
  (testing "isbn-checksum"
    (let [result (isbn-check-sum [4 8 9 3 2])]
      (is (= result 69)))))

;;; Exercise 8
(deftest exercise-8-test
  (testing "exercise-8"
    (let [one (isbn? "0131774115")
          two (isbn? "0977716614")
          three (isbn? "1934356190")]
      (is (= one true))
      (is (= two false))
      (is (= three true)))))

