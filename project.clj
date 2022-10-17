(defproject district0x/district-ui-component-notification "1.0.1"
  :description "district UI module providing component for notifications"
  :url "https://github.com/district0x/district-ui-component-notification"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[district0x/district-ui-notification "1.0.0"]
                 [org.clojure/clojurescript "1.9.946"]
                 [re-frame "0.10.5"]]

  :exclusions [[org.clojure/clojure]
               [org.clojure/clojurescript]])
