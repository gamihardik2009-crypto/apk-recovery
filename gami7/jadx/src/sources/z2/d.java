package z2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m2.C0865g;
import n2.AbstractC0946A;
import n2.AbstractC0960l;
import n2.AbstractC0963o;
import n2.AbstractC0964p;

/* loaded from: classes.dex */
public final class d implements F2.b, c {

    /* renamed from: b, reason: collision with root package name */
    public static final Map f11895b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f11896c;

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f11897d;

    /* renamed from: a, reason: collision with root package name */
    public final Class f11898a;

    static {
        List v3 = AbstractC0963o.v(y2.a.class, y2.c.class, y2.e.class, y2.f.class, y2.g.class, R.a.class, y2.h.class, y2.i.class, R.a.class, R.a.class, R.a.class, R.a.class, y2.b.class, R.a.class, R.a.class, R.a.class, R.a.class, R.a.class, R.a.class, R.a.class, R.a.class, R.a.class, y2.d.class);
        ArrayList arrayList = new ArrayList(AbstractC0964p.z(v3, 10));
        int i2 = 0;
        for (Object obj : v3) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC0963o.y();
                throw null;
            }
            arrayList.add(new C0865g((Class) obj, Integer.valueOf(i2)));
            i2 = i3;
        }
        f11895b = AbstractC0946A.t(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        h.e(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            h.c(str);
            sb.append(H2.l.g0(str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f11895b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            hashMap3.put(cls.getName(), "kotlin.Function" + intValue);
        }
        f11896c = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC0946A.m(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), H2.l.g0((String) entry2.getValue()));
        }
        f11897d = linkedHashMap;
    }

    public d(Class cls) {
        h.f(cls, "jClass");
        this.f11898a = cls;
    }

    @Override // z2.c
    public final Class a() {
        return this.f11898a;
    }

    public final String b() {
        String str;
        Class cls = this.f11898a;
        h.f(cls, "jClass");
        String str2 = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            boolean isArray = cls.isArray();
            LinkedHashMap linkedHashMap = f11897d;
            if (!isArray) {
                String str3 = (String) linkedHashMap.get(cls.getName());
                return str3 == null ? cls.getSimpleName() : str3;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                str2 = str.concat("Array");
            }
            return str2 == null ? "Array" : str2;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return H2.l.f0(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return H2.l.f0(simpleName, enclosingConstructor.getName() + '$');
        }
        int T3 = H2.l.T(simpleName, '$', 0, false, 6);
        if (T3 == -1) {
            return simpleName;
        }
        String substring = simpleName.substring(T3 + 1, simpleName.length());
        h.e(substring, "substring(...)");
        return substring;
    }

    public final boolean c(Object obj) {
        Class cls = this.f11898a;
        h.f(cls, "jClass");
        Map map = f11895b;
        h.d(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return v.e(num.intValue(), obj);
        }
        if (cls.isPrimitive()) {
            cls = AbstractC0960l.j(t.a(cls));
        }
        return cls.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d) && h.a(AbstractC0960l.j(this), AbstractC0960l.j((F2.b) obj));
    }

    public final int hashCode() {
        return AbstractC0960l.j(this).hashCode();
    }

    public final String toString() {
        return this.f11898a.toString() + " (Kotlin reflection is not available)";
    }
}
