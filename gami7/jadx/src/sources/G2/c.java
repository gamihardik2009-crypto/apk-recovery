package G2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class c implements Iterator, A2.a {

    /* renamed from: i, reason: collision with root package name */
    public final Iterator f1250i;

    /* renamed from: k, reason: collision with root package name */
    public Object f1252k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f1253l;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1249h = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f1251j = -1;

    public c(d dVar) {
        this.f1253l = dVar;
        this.f1250i = dVar.f1255b.iterator();
    }

    public void a() {
        Object next;
        boolean booleanValue;
        do {
            Iterator it = this.f1250i;
            if (!it.hasNext()) {
                this.f1251j = 0;
                return;
            }
            next = it.next();
            d dVar = (d) this.f1253l;
            booleanValue = ((Boolean) dVar.f1256c.l(next)).booleanValue();
            dVar.getClass();
        } while (booleanValue);
        this.f1252k = next;
        this.f1251j = 1;
    }

    public void b() {
        Iterator it = this.f1250i;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((d) this.f1253l).f1256c.l(next)).booleanValue()) {
                this.f1251j = 1;
                this.f1252k = next;
                return;
            }
        }
        this.f1251j = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1249h) {
            case 0:
                if (this.f1251j == -1) {
                    a();
                }
                if (this.f1251j == 1) {
                }
                break;
            default:
                if (this.f1251j == -1) {
                    b();
                }
                if (this.f1251j == 1) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f1249h) {
            case 0:
                if (this.f1251j == -1) {
                    a();
                }
                if (this.f1251j == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f1252k;
                this.f1252k = null;
                this.f1251j = -1;
                return obj;
            default:
                if (this.f1251j == -1) {
                    b();
                }
                if (this.f1251j == 0) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.f1252k;
                this.f1252k = null;
                this.f1251j = -1;
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f1249h) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public c(d dVar, byte b3) {
        this.f1253l = dVar;
        this.f1250i = dVar.f1255b.iterator();
    }
}
