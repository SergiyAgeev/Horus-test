package test.horus;

import java.util.List;

public class MyStructure implements IMyStructure {
    public List<INode> nodes;

    @Override
    public INode findByCode(String code) {
        return nodes.stream()
                .filter(a -> a.getCode().equals(code))
                .findFirst()
                .get();
    }

    @Override
    public INode findByRenderer(String renderer) {
        return nodes.stream()
                .filter(a -> a.getRenderer().equals(renderer))
                .findFirst()
                .get();
    }

    public int count() {
        return nodes.size();
    }

    private class Node implements ICompositeNode {
        private String code;
        private String rendered;

        public void setCode(String code) {
            this.code = code;
        }

        public void setRendered(String rendered) {
            this.rendered = rendered;
        }

        @Override
        public String getCode() {
            return code;
        }

        @Override
        public String getRenderer() {
            return rendered;
        }

        @Override
        public List<INode> getNodes() {
            return nodes;
        }
    }
}
