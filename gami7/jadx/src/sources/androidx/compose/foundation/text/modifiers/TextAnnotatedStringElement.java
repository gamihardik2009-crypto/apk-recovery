package androidx.compose.foundation.text.modifiers;

import B1.t;
import C.i;
import C0.C0024g;
import C0.K;
import H0.d;
import K1.f;
import V.n;
import java.util.List;
import m.AbstractC0837j;
import t0.S;
import y2.c;
import z2.h;

/* loaded from: classes.dex */
public final class TextAnnotatedStringElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final C0024g f6703b;

    /* renamed from: c, reason: collision with root package name */
    public final K f6704c;

    /* renamed from: d, reason: collision with root package name */
    public final d f6705d;

    /* renamed from: e, reason: collision with root package name */
    public final c f6706e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6707f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f6708g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6709h;

    /* renamed from: i, reason: collision with root package name */
    public final int f6710i;

    /* renamed from: j, reason: collision with root package name */
    public final List f6711j = null;

    /* renamed from: k, reason: collision with root package name */
    public final c f6712k = null;

    /* renamed from: l, reason: collision with root package name */
    public final c f6713l = null;

    public TextAnnotatedStringElement(C0024g c0024g, K k3, d dVar, c cVar, int i2, boolean z3, int i3, int i4) {
        this.f6703b = c0024g;
        this.f6704c = k3;
        this.f6705d = dVar;
        this.f6706e = cVar;
        this.f6707f = i2;
        this.f6708g = z3;
        this.f6709h = i3;
        this.f6710i = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        textAnnotatedStringElement.getClass();
        return h.a(null, null) && h.a(this.f6703b, textAnnotatedStringElement.f6703b) && h.a(this.f6704c, textAnnotatedStringElement.f6704c) && h.a(this.f6711j, textAnnotatedStringElement.f6711j) && h.a(this.f6705d, textAnnotatedStringElement.f6705d) && this.f6706e == textAnnotatedStringElement.f6706e && this.f6713l == textAnnotatedStringElement.f6713l && f.t(this.f6707f, textAnnotatedStringElement.f6707f) && this.f6708g == textAnnotatedStringElement.f6708g && this.f6709h == textAnnotatedStringElement.f6709h && this.f6710i == textAnnotatedStringElement.f6710i && this.f6712k == textAnnotatedStringElement.f6712k && h.a(null, null);
    }

    public final int hashCode() {
        int hashCode = (this.f6705d.hashCode() + ((this.f6704c.hashCode() + (this.f6703b.hashCode() * 31)) * 31)) * 31;
        c cVar = this.f6706e;
        int f3 = (((t.f(AbstractC0837j.b(this.f6707f, (hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31, 31), 31, this.f6708g) + this.f6709h) * 31) + this.f6710i) * 31;
        List list = this.f6711j;
        int hashCode2 = (f3 + (list != null ? list.hashCode() : 0)) * 31;
        c cVar2 = this.f6712k;
        int hashCode3 = (hashCode2 + (cVar2 != null ? cVar2.hashCode() : 0)) * 29791;
        c cVar3 = this.f6713l;
        return hashCode3 + (cVar3 != null ? cVar3.hashCode() : 0);
    }

    @Override // t0.S
    public final n l() {
        c cVar = this.f6712k;
        c cVar2 = this.f6713l;
        C0024g c0024g = this.f6703b;
        K k3 = this.f6704c;
        d dVar = this.f6705d;
        c cVar3 = this.f6706e;
        int i2 = this.f6707f;
        boolean z3 = this.f6708g;
        int i3 = this.f6709h;
        int i4 = this.f6710i;
        List list = this.f6711j;
        i iVar = new i();
        iVar.f382u = c0024g;
        iVar.f383v = k3;
        iVar.f384w = dVar;
        iVar.f385x = cVar3;
        iVar.f386y = i2;
        iVar.f387z = z3;
        iVar.f375A = i3;
        iVar.f376B = i4;
        iVar.f377C = list;
        iVar.f378D = cVar;
        iVar.E = cVar2;
        return iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
    
        if (r2.f475a.b(r0.f475a) != false) goto L10;
     */
    @Override // t0.S
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(V.n r11) {
        /*
            r10 = this;
            C.i r11 = (C.i) r11
            r11.getClass()
            r0 = 0
            boolean r0 = z2.h.a(r0, r0)
            r1 = 1
            r0 = r0 ^ r1
            if (r0 != 0) goto L23
            C0.K r0 = r11.f383v
            C0.K r2 = r10.f6704c
            if (r2 == r0) goto L1f
            C0.C r2 = r2.f475a
            C0.C r0 = r0.f475a
            boolean r0 = r2.b(r0)
            if (r0 == 0) goto L23
            goto L22
        L1f:
            r2.getClass()
        L22:
            r1 = 0
        L23:
            r8 = r1
            C0.g r0 = r10.f6703b
            boolean r9 = r11.P0(r0)
            H0.d r6 = r10.f6705d
            int r7 = r10.f6707f
            C0.K r1 = r10.f6704c
            java.util.List r2 = r10.f6711j
            int r3 = r10.f6710i
            int r4 = r10.f6709h
            boolean r5 = r10.f6708g
            r0 = r11
            boolean r0 = r0.O0(r1, r2, r3, r4, r5, r6, r7)
            y2.c r1 = r10.f6706e
            y2.c r2 = r10.f6712k
            y2.c r3 = r10.f6713l
            boolean r1 = r11.N0(r1, r2, r3)
            r11.K0(r8, r9, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement.m(V.n):void");
    }
}
