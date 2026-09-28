package N;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import n2.AbstractC0952d;

/* loaded from: classes.dex */
public abstract class c extends AbstractC0952d implements M.b, Collection, A2.a {
    public abstract c b(int i2, Object obj);

    @Override // m2.AbstractC0872n, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // m2.AbstractC0872n, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract c e(Object obj);

    public c f(Collection collection) {
        g g3 = g();
        g3.addAll(collection);
        return g3.e();
    }

    public abstract g g();

    public abstract c h(b bVar);

    public abstract c i(int i2);

    @Override // n2.AbstractC0952d, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public abstract c j(int i2, Object obj);

    @Override // n2.AbstractC0952d, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // n2.AbstractC0952d, java.util.List
    public final List subList(int i2, int i3) {
        return new M.a(this, i2, i3);
    }
}
