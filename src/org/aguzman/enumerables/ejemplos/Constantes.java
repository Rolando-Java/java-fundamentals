package org.aguzman.enumerables.ejemplos;

public class Constantes {

    public enum Framework {
        SPRING(0), NETCORE(1);

        private final int id;

        Framework(int id) {
            this.id = id;
        }

        public int getId() {
            return this.id;
        }

        @Override
        public String toString() {
            return "Id: " + this.id + " Framework: " + this.name().toLowerCase();
        }

    }

    public enum Lenguaje {
        JAVA(0,Framework.SPRING), CCHARP(1,Framework.NETCORE);

        private final int id;
        private final Framework framework;

        Lenguaje(int id, Framework framework) {
            this.id = id;
            this.framework = framework;
        }

        public int getId() {
            return this.id;
        }

        public Framework getFramework() {
            return this.framework;
        }

        @Override
        public String toString() {
            return "Id: " + this.id + " Lenguaje: " + this.name().toLowerCase()
                    + " " + this.framework.toString();
        }

    }

}
