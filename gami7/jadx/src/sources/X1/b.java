package X1;

import J.C0257c;
import J.C0285q;
import V.o;
import m2.C0880v;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements y2.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6207h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f6208i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f6209j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f6210k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6211l;

    public /* synthetic */ b(String str, o oVar, int i2, int i3, int i4) {
        this.f6207h = i4;
        this.f6208i = str;
        this.f6209j = oVar;
        this.f6210k = i2;
        this.f6211l = i3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        int i2 = this.f6207h;
        C0285q c0285q = (C0285q) obj;
        ((Integer) obj2).intValue();
        switch (i2) {
            case 0:
                String str = this.f6208i;
                z2.h.f(str, "$title");
                l0.c.g(str, this.f6209j, c0285q, C0257c.Y(this.f6210k | 1), this.f6211l);
                break;
            case 1:
                String str2 = this.f6208i;
                z2.h.f(str2, "$name");
                l0.c.c(str2, this.f6209j, c0285q, C0257c.Y(this.f6210k | 1), this.f6211l);
                break;
            default:
                String str3 = this.f6208i;
                z2.h.f(str3, "$status");
                l0.c.i(str3, this.f6209j, c0285q, C0257c.Y(this.f6210k | 1), this.f6211l);
                break;
        }
        return C0880v.f8657a;
    }
}
