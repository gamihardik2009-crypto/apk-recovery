package I0;

/* renamed from: I0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0251h implements InterfaceC0252i {

    /* renamed from: a, reason: collision with root package name */
    public final int f3896a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3897b;

    public C0251h(int i2, int i3) {
        this.f3896a = i2;
        this.f3897b = i3;
        if (i2 < 0 || i3 < 0) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i2 + " and " + i3 + " respectively.").toString());
        }
    }

    @Override // I0.InterfaceC0252i
    public final void a(j jVar) {
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 < this.f3896a) {
                int i5 = i4 + 1;
                int i6 = jVar.f3899b;
                if (i6 <= i5) {
                    i4 = i6;
                    break;
                } else {
                    i4 = (Character.isHighSurrogate(jVar.b((i6 - i5) + (-1))) && Character.isLowSurrogate(jVar.b(jVar.f3899b - i5))) ? i4 + 2 : i5;
                    i3++;
                }
            } else {
                break;
            }
        }
        int i7 = 0;
        while (true) {
            if (i2 >= this.f3897b) {
                break;
            }
            int i8 = i7 + 1;
            int i9 = jVar.f3900c + i8;
            E0.f fVar = jVar.f3898a;
            if (i9 >= fVar.b()) {
                i7 = fVar.b() - jVar.f3900c;
                break;
            } else {
                i7 = (Character.isHighSurrogate(jVar.b((jVar.f3900c + i8) + (-1))) && Character.isLowSurrogate(jVar.b(jVar.f3900c + i8))) ? i7 + 2 : i8;
                i2++;
            }
        }
        int i10 = jVar.f3900c;
        jVar.a(i10, i7 + i10);
        int i11 = jVar.f3899b;
        jVar.a(i11 - i4, i11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0251h)) {
            return false;
        }
        C0251h c0251h = (C0251h) obj;
        return this.f3896a == c0251h.f3896a && this.f3897b == c0251h.f3897b;
    }

    public final int hashCode() {
        return (this.f3896a * 31) + this.f3897b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.f3896a);
        sb.append(", lengthAfterCursor=");
        return B1.t.j(sb, this.f3897b, ')');
    }
}
