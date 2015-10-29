(ns sicp.ex1-11)

(defn f-recurive [n]
  (if (< n 3) 3
      (+ (f-recurive (- n 1))
         (* 2 (f-recurive (- n 2)))
         (* 3 (f-recurive (- n 3))))))


(defn f-iter-helper [n-2 n-1 n counter]
  (if (zero? counter)
    n
    (recur n-1 n
           (+ n (* 2 n-1) (* 3 n-2))
           (dec counter))))

(defn f-iterative [n]
  (if (< n 3)
    3
    (f-iter-helper 3 3 3 (- n 2))))
