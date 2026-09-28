package O;

/* loaded from: classes.dex */
public final class p extends o {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5130k;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f5130k) {
            case 0:
                int i2 = this.f5129j;
                this.f5129j = i2 + 2;
                Object[] objArr = this.f5127h;
                return new a(objArr[i2], objArr[i2 + 1]);
            case 1:
                int i3 = this.f5129j;
                this.f5129j = i3 + 2;
                return this.f5127h[i3];
            default:
                int i4 = this.f5129j;
                this.f5129j = i4 + 2;
                return this.f5127h[i4 + 1];
        }
    }
}
