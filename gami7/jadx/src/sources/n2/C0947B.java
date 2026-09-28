package n2;

import T.D;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: n2.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0947B extends AbstractC0952d {

    /* renamed from: i, reason: collision with root package name */
    public final List f9153i;

    public C0947B(List list) {
        this.f9153i = list;
    }

    @Override // m2.AbstractC0872n
    public final int a() {
        return this.f9153i.size();
    }

    @Override // java.util.List
    public final Object get(int i2) {
        if (i2 >= 0 && i2 <= AbstractC0963o.u(this)) {
            return this.f9153i.get(AbstractC0963o.u(this) - i2);
        }
        StringBuilder l3 = B1.t.l("Element index ", i2, " must be in range [");
        l3.append(new E2.d(0, AbstractC0963o.u(this), 1));
        l3.append("].");
        throw new IndexOutOfBoundsException(l3.toString());
    }

    @Override // n2.AbstractC0952d, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new D(this, 0);
    }

    @Override // n2.AbstractC0952d, java.util.List
    public final ListIterator listIterator() {
        return new D(this, 0);
    }

    @Override // n2.AbstractC0952d, java.util.List
    public final ListIterator listIterator(int i2) {
        return new D(this, i2);
    }
}
