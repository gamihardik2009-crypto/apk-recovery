package r1;

import B.F;
import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import s1.AbstractC1195a;
import v1.InterfaceC1370b;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9970a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f9971b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9972c;

    /* renamed from: g, reason: collision with root package name */
    public Executor f9976g;

    /* renamed from: h, reason: collision with root package name */
    public Executor f9977h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC1370b f9978i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f9979j;

    /* renamed from: m, reason: collision with root package name */
    public boolean f9982m;
    public HashSet q;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f9973d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f9974e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f9975f = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final int f9980k = 1;

    /* renamed from: l, reason: collision with root package name */
    public boolean f9981l = true;

    /* renamed from: n, reason: collision with root package name */
    public final long f9983n = -1;

    /* renamed from: o, reason: collision with root package name */
    public final F f9984o = new F(29);

    /* renamed from: p, reason: collision with root package name */
    public final LinkedHashSet f9985p = new LinkedHashSet();

    public q(Context context, Class cls, String str) {
        this.f9970a = context;
        this.f9971b = cls;
        this.f9972c = str;
    }

    public final void a(AbstractC1195a... abstractC1195aArr) {
        if (this.q == null) {
            this.q = new HashSet();
        }
        for (AbstractC1195a abstractC1195a : abstractC1195aArr) {
            HashSet hashSet = this.q;
            z2.h.c(hashSet);
            hashSet.add(Integer.valueOf(abstractC1195a.f10201a));
            HashSet hashSet2 = this.q;
            z2.h.c(hashSet2);
            hashSet2.add(Integer.valueOf(abstractC1195a.f10202b));
        }
        this.f9984o.s((AbstractC1195a[]) Arrays.copyOf(abstractC1195aArr, abstractC1195aArr.length));
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r1.r b() {
        /*
            Method dump skipped, instructions count: 931
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.q.b():r1.r");
    }
}
