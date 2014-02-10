(ns fp-oo.ch05-test
  (:require [clojure.test :refer :all]
            [fp-oo.ch05 :refer :all]))


(deftest make-test
  (testing "make"
    (let [point (make Point 1 2)]
      (is (= (:__class_symbol__ point) 'Point))
      (is (= (:x point) 1))
      (is (= (:y point) 2)))))



(deftest send-to-test
  (testing "send-to"
    (use 'fp-oo.ch05)
    (let [point (make Point 1 2)
          shifted-point (send-to (make Point 1 2) :shift 2 2)]
      (is (= (:x shifted-point) 3))
      (is (= (:y shifted-point) 4)))))

