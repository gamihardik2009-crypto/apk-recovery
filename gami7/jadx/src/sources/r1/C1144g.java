package r1;

import B.F;
import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import t0.AbstractC1265x;
import v1.InterfaceC1370b;

/* renamed from: r1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1144g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9933a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9934b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1370b f9935c;

    /* renamed from: d, reason: collision with root package name */
    public final F f9936d;

    /* renamed from: e, reason: collision with root package name */
    public final List f9937e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f9938f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9939g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f9940h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f9941i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f9942j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f9943k;

    /* renamed from: l, reason: collision with root package name */
    public final Set f9944l;

    /* renamed from: m, reason: collision with root package name */
    public final List f9945m;

    /* renamed from: n, reason: collision with root package name */
    public final List f9946n;

    public C1144g(Context context, String str, InterfaceC1370b interfaceC1370b, F f3, ArrayList arrayList, boolean z3, int i2, Executor executor, Executor executor2, boolean z4, boolean z5, LinkedHashSet linkedHashSet, ArrayList arrayList2, ArrayList arrayList3) {
        z2.h.f(context, "context");
        z2.h.f(f3, "migrationContainer");
        AbstractC1265x.f("journalMode", i2);
        z2.h.f(arrayList2, "typeConverters");
        z2.h.f(arrayList3, "autoMigrationSpecs");
        this.f9933a = context;
        this.f9934b = str;
        this.f9935c = interfaceC1370b;
        this.f9936d = f3;
        this.f9937e = arrayList;
        this.f9938f = z3;
        this.f9939g = i2;
        this.f9940h = executor;
        this.f9941i = executor2;
        this.f9942j = z4;
        this.f9943k = z5;
        this.f9944l = linkedHashSet;
        this.f9945m = arrayList2;
        this.f9946n = arrayList3;
    }

    public final boolean a(int i2, int i3) {
        if ((i2 > i3 && this.f9943k) || !this.f9942j) {
            return false;
        }
        Set set = this.f9944l;
        return set == null || !set.contains(Integer.valueOf(i2));
    }
}
