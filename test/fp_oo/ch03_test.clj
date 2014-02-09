(ns fp-oo.ch03-test
  (:require [clojure.test :refer :all]
            [fp-oo.ch03 :refer :all]))

(deftest add-test
  (testing "adds two points"
    (is (= (add (Point 1 2) (Point 3 5)) (Point 4 7)))))

(deftest add-shift-test
  (testing "adds two points"
    (is (= (add-shift (Point 1 2) (Point 3 5)) (Point 4 7)))))

(deftest make-triangle-test
  (testing "creating a triangle with make"
    (is (=
          (make
             Triangle
             (make Point 1 2)
             (make Point 1 3)
             (make Point 3 1))
          (Triangle (Point 1 2) (Point 1 3) (Point 3 1))))))

(deftest equal-triangle-test
  (testing "equal triangles are equal"
    (is (= (equal-triangles? right-triangle equal-right-triangle) true))
    (is (= (equal-triangles? right-triangle right-triangle) true))
    (is (= (equal-triangles? right-triangle different-triangle) false))
    (is (= (equal-triangles? right-triangle different-triangle equal-right-triangle) false))))


(deftest valid-triangle?-test
  (testing "no points are duplicates"
    (is (= (valid-triangle? (Point 0 0) (Point 1 1) (Point 2 2)) true))
    (is (= (valid-triangle? (Point 0 0) (Point 0 0) (Point 2 2)) false))
    (is (= (valid-triangle? (Point 0 0) (Point 1 1)) false))))

