package i0;

import J.C0257c;
import J.C0274k0;
import J.W;
import c0.C0594m;
import e0.InterfaceC0654d;

/* renamed from: i0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0730w extends AbstractC0728u {

    /* renamed from: b, reason: collision with root package name */
    public final C0709b f7937b;

    /* renamed from: c, reason: collision with root package name */
    public String f7938c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7939d;

    /* renamed from: e, reason: collision with root package name */
    public final C0708a f7940e;

    /* renamed from: f, reason: collision with root package name */
    public y2.a f7941f;

    /* renamed from: g, reason: collision with root package name */
    public final C0274k0 f7942g;

    /* renamed from: h, reason: collision with root package name */
    public C0594m f7943h;

    /* renamed from: i, reason: collision with root package name */
    public final C0274k0 f7944i;

    /* renamed from: j, reason: collision with root package name */
    public long f7945j;

    /* renamed from: k, reason: collision with root package name */
    public float f7946k;

    /* renamed from: l, reason: collision with root package name */
    public float f7947l;

    /* renamed from: m, reason: collision with root package name */
    public final C0729v f7948m;

    public C0730w(C0709b c0709b) {
        this.f7937b = c0709b;
        c0709b.f7838i = new C0729v(this, 0);
        this.f7938c = "";
        this.f7939d = true;
        this.f7940e = new C0708a();
        this.f7941f = C0713f.f7882k;
        W w2 = W.f4109m;
        this.f7942g = C0257c.N(null, w2);
        this.f7944i = C0257c.N(new b0.f(0L), w2);
        this.f7945j = 9205357640488583168L;
        this.f7946k = 1.0f;
        this.f7947l = 1.0f;
        this.f7948m = new C0729v(this, 1);
    }

    @Override // i0.AbstractC0728u
    public final void a(InterfaceC0654d interfaceC0654d) {
        e(interfaceC0654d, 1.0f, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(e0.InterfaceC0654d r24, float r25, c0.C0594m r26) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.C0730w.e(e0.d, float, c0.m):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.f7938c);
        sb.append("\n\tviewportWidth: ");
        C0274k0 c0274k0 = this.f7944i;
        sb.append(b0.f.d(((b0.f) c0274k0.getValue()).f7072a));
        sb.append("\n\tviewportHeight: ");
        sb.append(b0.f.b(((b0.f) c0274k0.getValue()).f7072a));
        sb.append("\n");
        String sb2 = sb.toString();
        z2.h.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
