(defproject district0x/district-ui-component-notification "1.0.0-SNAPSHOT"
  :description "district UI module providing component for notifications"
  :url "https://github.com/district0x/district-ui-component-notification"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[district0x/district-ui-notification "1.0.0"]
                 [org.clojure/clojurescript "1.9.946"]
                 [re-frame "0.10.5"]
                 [soda-ash "0.76.0"]]

  :exclusions [[org.clojure/clojure]
               [org.clojure/clojurescript]])
