package s;

/* renamed from: s.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1170i implements InterfaceC1169h, InterfaceC1171j {

    /* renamed from: a, reason: collision with root package name */
    public final float f10146a;

    /* renamed from: b, reason: collision with root package name */
    public final float f10147b;

    public C1170i(float f3) {
        this.f10146a = f3;
        this.f10147b = f3;
    }

    @Override // s.InterfaceC1169h, s.InterfaceC1171j
    public final float a() {
        return this.f10147b;
    }

    @Override // s.InterfaceC1171j
    public final void b(O0.b bVar, int i2, int[] iArr, int[] iArr2) {
        c(bVar, i2, iArr, O0.k.f5148h, iArr2);
    }

    @Override // s.InterfaceC1169h
    public final void c(O0.b bVar, int i2, int[] iArr, O0.k kVar, int[] iArr2) {
        int i3;
        int i4;
        if (iArr.length == 0) {
            return;
        }
        int l3 = bVar.l(this.f10146a);
        boolean z3 = kVar == O0.k.f5149i;
        C1165d c1165d = AbstractC1173l.f10149a;
        if (z3) {
            i3 = 0;
            i4 = 0;
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i5 = iArr[length];
                int min = Math.min(i3, i2 - i5);
                iArr2[length] = min;
                i4 = Math.min(l3, (i2 - min) - i5);
                i3 = iArr2[length] + i5 + i4;
            }
        } else {
            int length2 = iArr.length;
            int i6 = 0;
            i3 = 0;
            i4 = 0;
            int i7 = 0;
            while (i6 < length2) {
                int i8 = iArr[i6];
                int min2 = Math.min(i3, i2 - i8);
                iArr2[i7] = min2;
                int min3 = Math.min(l3, (i2 - min2) - i8);
                int i9 = iArr2[i7] + i8 + min3;
                i6++;
                i7++;
                i4 = min3;
                i3 = i9;
            }
        }
        if (i3 - i4 < i2) {
            int round = Math.round((1 + (kVar != O0.k.f5148h ? (-1.0f) * (-1) : -1.0f)) * ((i2 - r11) / 2.0f));
            int length3 = iArr2.length;
            for (int i10 = 0; i10 < length3; i10++) {
                iArr2[i10] = iArr2[i10] + round;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1170i)) {
            return false;
        }
        if (!O0.e.a(this.f10146a, ((C1170i) obj).f10146a)) {
            return false;
        }
        C1172k c1172k = C1172k.f10148i;
        return z2.h.a(c1172k, c1172k);
    }

    public final int hashCode() {
        return C1172k.f10148i.hashCode() + B1.t.f(Float.hashCode(this.f10146a) * 31, 31, true);
    }

    public final String toString() {
        return "Arrangement#spacedAligned(" + ((Object) O0.e.b(this.f10146a)) + ", " + C1172k.f10148i + ')';
    }
}
