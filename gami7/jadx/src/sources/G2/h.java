package G2;

import C1.y;
import java.util.Iterator;
import java.util.NoSuchElementException;
import m2.C0880v;
import q2.C1079j;
import q2.InterfaceC1073d;
import q2.InterfaceC1078i;

/* loaded from: classes.dex */
public final class h implements Iterator, InterfaceC1073d, A2.a {

    /* renamed from: h, reason: collision with root package name */
    public int f1264h;

    /* renamed from: i, reason: collision with root package name */
    public Object f1265i;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC1073d f1266j;

    public final RuntimeException a() {
        int i2 = this.f1264h;
        if (i2 == 4) {
            return new NoSuchElementException();
        }
        if (i2 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f1264h);
    }

    public final void e(Object obj, InterfaceC1073d interfaceC1073d) {
        this.f1265i = obj;
        this.f1264h = 3;
        this.f1266j = interfaceC1073d;
        z2.h.f(interfaceC1073d, "frame");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2;
        while (true) {
            i2 = this.f1264h;
            if (i2 != 0) {
                break;
            }
            this.f1264h = 5;
            InterfaceC1073d interfaceC1073d = this.f1266j;
            z2.h.c(interfaceC1073d);
            this.f1266j = null;
            interfaceC1073d.t(C0880v.f8657a);
        }
        if (i2 == 1) {
            z2.h.c(null);
            throw null;
        }
        if (i2 == 2 || i2 == 3) {
            return true;
        }
        if (i2 == 4) {
            return false;
        }
        throw a();
    }

    @Override // q2.InterfaceC1073d
    public final InterfaceC1078i n() {
        return C1079j.f9784h;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i2 = this.f1264h;
        if (i2 == 0 || i2 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i2 == 2) {
            this.f1264h = 1;
            z2.h.c(null);
            throw null;
        }
        if (i2 != 3) {
            throw a();
        }
        this.f1264h = 0;
        Object obj = this.f1265i;
        this.f1265i = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // q2.InterfaceC1073d
    public final void t(Object obj) {
        y.J(obj);
        this.f1264h = 4;
    }
}
