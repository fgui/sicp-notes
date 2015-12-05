(ns sicp.ex2-54)

(defn equal [seq-a seq-b]
  (cond
    (and (empty? seq-a) (empty? seq-b)) true
    (= (first seq-a) (first seq-b)) (equal (rest seq-a) (rest seq-b))
    :else false))

(comment
  (first ()) ;;nil
  (rest ()) ;;nil

  (equal '(a b c) '(a b c))
  (equal '(a b c) '(a (b) c))
  )
