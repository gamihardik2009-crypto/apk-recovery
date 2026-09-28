package s;

/* renamed from: s.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1167f implements InterfaceC1171j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10143a;

    @Override // s.InterfaceC1171j
    public final void b(O0.b bVar, int i2, int[] iArr, int[] iArr2) {
        switch (this.f10143a) {
            case 0:
                AbstractC1173l.c(i2, iArr, iArr2, false);
                break;
            default:
                AbstractC1173l.b(iArr, iArr2, false);
                break;
        }
    }

    public final String toString() {
        switch (this.f10143a) {
            case 0:
                return "Arrangement#Bottom";
            default:
                return "Arrangement#Top";
        }
    }
}
