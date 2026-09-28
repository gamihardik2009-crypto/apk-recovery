package b2;

import C1.y;
import J.C0257c;
import J.C0285q;
import a.AbstractC0423a;
import m2.C0880v;
import z2.h;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements y2.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7155h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f7156i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f7157j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f7158k;

    public /* synthetic */ d(int i2, int i3, Object obj, String str) {
        this.f7155h = i3;
        this.f7156i = str;
        this.f7158k = obj;
        this.f7157j = i2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        int i2 = this.f7155h;
        C0285q c0285q = (C0285q) obj;
        ((Integer) obj2).intValue();
        switch (i2) {
            case 0:
                String str = this.f7156i;
                h.f(str, "$name");
                String str2 = (String) this.f7158k;
                h.f(str2, "$phone");
                AbstractC0423a.k(str, str2, c0285q, C0257c.Y(this.f7157j | 1));
                break;
            default:
                String str3 = this.f7156i;
                h.f(str3, "$title");
                y2.e eVar = (y2.e) this.f7158k;
                h.f(eVar, "$content");
                y.f(str3, eVar, c0285q, C0257c.Y(this.f7157j | 1));
                break;
        }
        return C0880v.f8657a;
    }
}
