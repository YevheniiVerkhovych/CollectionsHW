package NotDeletableArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class NotDeletableArrayList<E> extends ArrayList {

        @Override
        public boolean remove(Object o) {
            //return super.remove(o);
            return false;
        }

        @Override
        public boolean removeAll(Collection c) {
            return false;
        }

        @Override
        public Object remove(int index) {
            return null;
        }

        @Override
        protected void removeRange(int fromIndex, int toIndex) {

        }

        @Override
        public boolean retainAll(Collection c) {
            return false;
        }
    }


