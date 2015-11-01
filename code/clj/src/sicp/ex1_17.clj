(ns sicp.ex1-17)

;; lineal recursive
(defn mul1 [a b]
  (if (zero? b)
    0
    (+ a (mul1 a (dec b)))))

;; exponential recursive
(defn mul2 [a b]
  (if (zero? b)
    0
    (if (even? b)
      (mul2 (* 2 a) (/ b 2))
      (+ a (mul2 a (dec b))))))

;; exponential iterative
(defn mul3 [a b]
  (loop [acc 0 x a y b]
    (if (zero? y)
      acc
      (if (even? y)
        (recur acc (* 2 x) (/ y 2))
        (recur (+ acc x) x (dec y))))))

;;;; testing
;;;; in emacs C-c C-e at end each expression => true
(comment
  (= (* 1234 123) (mul1 1234 123))
  (= (* 1234 123) (mul2 1234 123))
  (= (* 1234 123) (mul3 1234 123))
  (= 0 (mul3 44 0))
  (= 0 (mul3 0 44))

  (time (* 2222 3333))
  (time (mul3 2222 3333))
  (time (mul2 2222 3333))
  (time (mul1 2222 3333))
  )
