package U2;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class h implements Iterator, A2.a {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5821h;

    /* renamed from: i, reason: collision with root package name */
    public int f5822i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f5823j;

    public h(f fVar, int i2) {
        this.f5821h = i2;
        switch (i2) {
            case 1:
                this.f5823j = fVar;
                this.f5822i = fVar.f();
                break;
            default:
                this.f5823j = fVar;
                this.f5822i = fVar.f();
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5821h) {
            case 0:
                if (this.f5822i > 0) {
                }
                break;
            default:
                if (this.f5822i > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f5821h) {
            case 0:
                f fVar = this.f5823j;
                int f3 = fVar.f();
                int i2 = this.f5822i;
                this.f5822i = i2 - 1;
                return fVar.d(f3 - i2);
            default:
                f fVar2 = this.f5823j;
                int f4 = fVar2.f();
                int i3 = this.f5822i;
                this.f5822i = i3 - 1;
                return fVar2.a(f4 - i3);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f5821h) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
