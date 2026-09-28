package j;

import java.util.Iterator;
import java.util.NoSuchElementException;
import n2.AbstractC0952d;
import n2.AbstractC0963o;
import n2.C0973y;

/* renamed from: j.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0744J implements Iterator, A2.a {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7982h;

    /* renamed from: i, reason: collision with root package name */
    public int f7983i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f7984j;

    public /* synthetic */ C0744J(int i2, Object obj) {
        this.f7982h = i2;
        this.f7984j = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f7982h) {
            case 0:
                return this.f7983i < ((C0742H) this.f7984j).f();
            case 1:
                return this.f7983i < ((AbstractC0952d) this.f7984j).a();
            case 2:
                return ((Iterator) this.f7984j).hasNext();
            default:
                return this.f7983i < ((Object[]) this.f7984j).length;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f7982h) {
            case 0:
                int i2 = this.f7983i;
                this.f7983i = i2 + 1;
                return ((C0742H) this.f7984j).g(i2);
            case 1:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i3 = this.f7983i;
                this.f7983i = i3 + 1;
                return ((AbstractC0952d) this.f7984j).get(i3);
            case 2:
                int i4 = this.f7983i;
                this.f7983i = i4 + 1;
                if (i4 >= 0) {
                    return new C0973y(i4, ((Iterator) this.f7984j).next());
                }
                AbstractC0963o.y();
                throw null;
            default:
                try {
                    Object[] objArr = (Object[]) this.f7984j;
                    int i5 = this.f7983i;
                    this.f7983i = i5 + 1;
                    return objArr[i5];
                } catch (ArrayIndexOutOfBoundsException e3) {
                    this.f7983i--;
                    throw new NoSuchElementException(e3.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f7982h) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0744J(Object[] objArr) {
        this.f7982h = 3;
        z2.h.f(objArr, "array");
        this.f7984j = objArr;
    }

    public C0744J(Iterator it) {
        this.f7982h = 2;
        z2.h.f(it, "iterator");
        this.f7984j = it;
    }
}
