package O2;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class v implements g1.n, v1.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5208h;

    /* renamed from: i, reason: collision with root package name */
    public final String f5209i;

    public /* synthetic */ v(String str, int i2) {
        this.f5208h = i2;
        this.f5209i = str;
    }

    @Override // g1.n
    public Object a() {
        return this;
    }

    @Override // v1.e
    public void b(v1.d dVar) {
    }

    @Override // g1.n
    public boolean c(CharSequence charSequence, int i2, int i3, g1.t tVar) {
        if (!TextUtils.equals(charSequence.subSequence(i2, i3), this.f5209i)) {
            return true;
        }
        tVar.f7761c = (tVar.f7761c & 3) | 4;
        return false;
    }

    @Override // v1.e
    public String d() {
        return this.f5209i;
    }

    public String toString() {
        switch (this.f5208h) {
            case 0:
                return B1.t.k(new StringBuilder("<"), this.f5209i, '>');
            default:
                return super.toString();
        }
    }

    public v(String str) {
        this.f5208h = 2;
        z2.h.f(str, "query");
        this.f5209i = str;
    }
}
