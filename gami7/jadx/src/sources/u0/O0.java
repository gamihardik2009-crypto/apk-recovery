package u0;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class O0 implements t0.g0 {

    /* renamed from: h, reason: collision with root package name */
    public final int f10957h;

    /* renamed from: i, reason: collision with root package name */
    public final List f10958i;

    /* renamed from: j, reason: collision with root package name */
    public Float f10959j = null;

    /* renamed from: k, reason: collision with root package name */
    public Float f10960k = null;

    /* renamed from: l, reason: collision with root package name */
    public A0.i f10961l = null;

    /* renamed from: m, reason: collision with root package name */
    public A0.i f10962m = null;

    public O0(int i2, ArrayList arrayList) {
        this.f10957h = i2;
        this.f10958i = arrayList;
    }

    @Override // t0.g0
    public final boolean R() {
        return this.f10958i.contains(this);
    }
}
