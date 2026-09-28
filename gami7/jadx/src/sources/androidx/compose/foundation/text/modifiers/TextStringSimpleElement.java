package androidx.compose.foundation.text.modifiers;

import B1.t;
import C.l;
import C0.K;
import H0.d;
import K1.f;
import V.n;
import m.AbstractC0837j;
import t0.S;
import z2.h;

/* loaded from: classes.dex */
public final class TextStringSimpleElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final String f6714b;

    /* renamed from: c, reason: collision with root package name */
    public final K f6715c;

    /* renamed from: d, reason: collision with root package name */
    public final d f6716d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6717e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6718f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6719g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6720h;

    public TextStringSimpleElement(String str, K k3, d dVar, int i2, boolean z3, int i3, int i4) {
        this.f6714b = str;
        this.f6715c = k3;
        this.f6716d = dVar;
        this.f6717e = i2;
        this.f6718f = z3;
        this.f6719g = i3;
        this.f6720h = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        textStringSimpleElement.getClass();
        return h.a(null, null) && h.a(this.f6714b, textStringSimpleElement.f6714b) && h.a(this.f6715c, textStringSimpleElement.f6715c) && h.a(this.f6716d, textStringSimpleElement.f6716d) && f.t(this.f6717e, textStringSimpleElement.f6717e) && this.f6718f == textStringSimpleElement.f6718f && this.f6719g == textStringSimpleElement.f6719g && this.f6720h == textStringSimpleElement.f6720h;
    }

    public final int hashCode() {
        return (((t.f(AbstractC0837j.b(this.f6717e, (this.f6716d.hashCode() + ((this.f6715c.hashCode() + (this.f6714b.hashCode() * 31)) * 31)) * 31, 31), 31, this.f6718f) + this.f6719g) * 31) + this.f6720h) * 31;
    }

    @Override // t0.S
    public final n l() {
        l lVar = new l();
        lVar.f398u = this.f6714b;
        lVar.f399v = this.f6715c;
        lVar.f400w = this.f6716d;
        lVar.f401x = this.f6717e;
        lVar.f402y = this.f6718f;
        lVar.f403z = this.f6719g;
        lVar.f394A = this.f6720h;
        return lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r4.f475a.b(r1.f475a) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0032  */
    @Override // t0.S
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(V.n r14) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextStringSimpleElement.m(V.n):void");
    }
}
