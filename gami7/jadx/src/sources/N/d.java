package N;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class d extends a {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f4950j = 1;

    /* renamed from: k, reason: collision with root package name */
    public final Object f4951k;

    public d(Object[] objArr, int i2, int i3) {
        super(i2, i3);
        this.f4951k = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f4950j) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i2 = this.f4946h;
                this.f4946h = i2 + 1;
                return ((Object[]) this.f4951k)[i2];
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f4946h++;
                return this.f4951k;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f4950j) {
            case 0:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                int i2 = this.f4946h - 1;
                this.f4946h = i2;
                return ((Object[]) this.f4951k)[i2];
            default:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.f4946h--;
                return this.f4951k;
        }
    }

    public d(int i2, Object obj) {
        super(i2, 1);
        this.f4951k = obj;
    }
}
