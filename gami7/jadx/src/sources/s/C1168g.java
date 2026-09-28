package s;

/* renamed from: s.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1168g implements InterfaceC1169h, InterfaceC1171j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10144a;

    /* renamed from: b, reason: collision with root package name */
    public final float f10145b;

    public C1168g(int i2) {
        this.f10144a = i2;
        switch (i2) {
            case 1:
                this.f10145b = 0;
                break;
            case 2:
                this.f10145b = 0;
                break;
            case 3:
                this.f10145b = 0;
                break;
            default:
                this.f10145b = 0;
                break;
        }
    }

    @Override // s.InterfaceC1169h, s.InterfaceC1171j
    public final float a() {
        switch (this.f10144a) {
        }
        return this.f10145b;
    }

    @Override // s.InterfaceC1171j
    public final void b(O0.b bVar, int i2, int[] iArr, int[] iArr2) {
        switch (this.f10144a) {
            case 0:
                AbstractC1173l.a(i2, iArr, iArr2, false);
                break;
            case 1:
                AbstractC1173l.d(i2, iArr, iArr2, false);
                break;
            case 2:
                AbstractC1173l.e(i2, iArr, iArr2, false);
                break;
            default:
                AbstractC1173l.f(i2, iArr, iArr2, false);
                break;
        }
    }

    @Override // s.InterfaceC1169h
    public final void c(O0.b bVar, int i2, int[] iArr, O0.k kVar, int[] iArr2) {
        switch (this.f10144a) {
            case 0:
                if (kVar != O0.k.f5148h) {
                    AbstractC1173l.a(i2, iArr, iArr2, true);
                    break;
                } else {
                    AbstractC1173l.a(i2, iArr, iArr2, false);
                    break;
                }
            case 1:
                if (kVar != O0.k.f5148h) {
                    AbstractC1173l.d(i2, iArr, iArr2, true);
                    break;
                } else {
                    AbstractC1173l.d(i2, iArr, iArr2, false);
                    break;
                }
            case 2:
                if (kVar != O0.k.f5148h) {
                    AbstractC1173l.e(i2, iArr, iArr2, true);
                    break;
                } else {
                    AbstractC1173l.e(i2, iArr, iArr2, false);
                    break;
                }
            default:
                if (kVar != O0.k.f5148h) {
                    AbstractC1173l.f(i2, iArr, iArr2, true);
                    break;
                } else {
                    AbstractC1173l.f(i2, iArr, iArr2, false);
                    break;
                }
        }
    }

    public final String toString() {
        switch (this.f10144a) {
            case 0:
                return "Arrangement#Center";
            case 1:
                return "Arrangement#SpaceAround";
            case 2:
                return "Arrangement#SpaceBetween";
            default:
                return "Arrangement#SpaceEvenly";
        }
    }
}
